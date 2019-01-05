package org.py;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ResourceTest {
    @Test
    public void test() throws IOException {
        ClassPathResource resource = new ClassPathResource("images");
        System.out.println(resource.getFile().getAbsolutePath());
    }
}
