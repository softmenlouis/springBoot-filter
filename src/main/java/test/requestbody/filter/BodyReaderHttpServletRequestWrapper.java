package test.requestbody.filter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.mock.web.DelegatingServletInputStream;

public class BodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper{
	private final String body;

	public BodyReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
	    super(request);
	    try(BufferedReader bufferedReader = request.getReader()){
	    	body = request.getReader().lines().collect(Collectors.joining());
	    }
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
	    return new DelegatingServletInputStream(new ByteArrayInputStream(body.getBytes()));
	}

	@Override
	public BufferedReader getReader() throws IOException {
	    return new BufferedReader(new InputStreamReader(this.getInputStream()));
	}

	public String getBody() {
	    return this.body;
	}
}