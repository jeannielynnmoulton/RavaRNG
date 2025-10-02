package com.example.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LongTypeDiffblueTest {
    /**
     * Test {@link LongType#doubleValue()}.
     *
     * <p>Method under test: {@link LongType#doubleValue()}
     */
    @Test
    @DisplayName("Test doubleValue()")
    @Tag("MaintainedByDiffblue")
    void testDoubleValue() {
        // Arrange, Act and Assert
        assertEquals(1.0d, new LongType(1L).doubleValue());
    }
}
