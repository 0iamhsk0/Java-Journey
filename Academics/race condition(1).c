#include <stdio.h>
#include <pthread.h>

#define NUM_THREADS 2
#define ITERATIONS 1000000

int counter = 0;

void *increment_counter(void *thread_id)
{
    int i;
    for (i = 0; i < ITERATIONS; i++)
    {
        counter++; // Critical section
    }
    pthread_exit(NULL);
}

int main()
{
    pthread_t threads[NUM_THREADS];
    int t;

    for (t = 0; t < NUM_THREADS; t++)
    {
        pthread_create(&threads[t], NULL, increment_counter, (void *)t);
    }

    for (t = 0; t < NUM_THREADS; t++)
    {
        pthread_join(threads[t], NULL);
    }

    printf("Final value of counter: %d\n", counter);

    return 0;
}
