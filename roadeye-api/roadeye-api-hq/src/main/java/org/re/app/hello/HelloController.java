package org.re.app.hello;

import org.re.domain.common.CommonAppExceptionCode;
import org.re.exception.AppException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello() {
        return Map.of("message", "Hello, World!");
    }

    @GetMapping("/error")
    public Object error() {
        throw new AppException(CommonAppExceptionCode.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/error-internal")
    public Object errorInternal() {
        throw new RuntimeException("Internal error");
    }
}
