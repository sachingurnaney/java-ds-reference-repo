package com.dsjava.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testOfferPoll() {
        QueueUsingArray<Integer> q = new QueueUsingArray<>(2);
        q.offer(1); q.offer(2); q.offer(3);
        assertEquals(1, q.poll());
        assertEquals(2, q.poll());
        assertEquals(3, q.poll());
        assertNull(q.poll());
    }
}
