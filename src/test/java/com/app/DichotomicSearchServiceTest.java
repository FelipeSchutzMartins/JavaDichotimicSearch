package com.app;

import com.app.service.DichotomicSearchService;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DichotomicSearchServiceTest {

    @InjectMocks
    private DichotomicSearchService dichotomicSearchService;

    @Test
    public void shouldReturnExpectedResults() {
        assertEquals(List.of("E"), dichotomicSearchService.dichotomicSearchBySignals("."));
        assertEquals(List.of("E", "T"), dichotomicSearchService.dichotomicSearchBySignals("?"));
        assertEquals(List.of("I", "A"), dichotomicSearchService.dichotomicSearchBySignals(".?"));
    }
}
