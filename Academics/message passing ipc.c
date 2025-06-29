#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>

#define MAX_MESSAGE_SIZE 100

// Define a structure for the message
struct message
{
    long message_type;
    char message_text[MAX_MESSAGE_SIZE];
};

int main()
{
    int msgid;
    struct message msg_buffer;

    // Generate a unique key for the message queue
    key_t key = ftok("msg_queue_key", 'A');
    if (key == -1)
    {
        perror("ftok");
        exit(EXIT_FAILURE);
    }

    // Create a message queue
    msgid = msgget(key, IPC_CREAT | 0666);
    if (msgid == -1)
    {
        perror("msgget");
        exit(EXIT_FAILURE);
    }

    printf("Message queue created with ID: %d\n", msgid);

    // Send a message
    printf("Sending message...\n");
    msg_buffer.message_type = 1;
    strcpy(msg_buffer.message_text, "Hello from sender!");
    if (msgsnd(msgid, &msg_buffer, sizeof(struct message), 0) == -1)
    {
        perror("msgsnd");
        exit(EXIT_FAILURE);
    }
    printf("Message sent\n");

    // Receive a message
    printf("Receiving message...\n");
    if (msgrcv(msgid, &msg_buffer, sizeof(struct message), 1, 0) == -1)
    {
        perror("msgrcv");
        exit(EXIT_FAILURE);
    }
    printf("Message received: %s\n", msg_buffer.message_text);

    // Close and remove the message queue
    if (msgctl(msgid, IPC_RMID, NULL) == -1)
    {
        perror("msgctl");
        exit(EXIT_FAILURE);
    }
    printf("Message queue removed\n");

    return 0;
}
