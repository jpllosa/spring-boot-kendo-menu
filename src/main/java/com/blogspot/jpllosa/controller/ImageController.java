package com.blogspot.jpllosa.controller;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageController {

	@GetMapping(
		value = "/get-image",
		produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody byte[] getImage() throws IOException {
		InputStream in = getClass().getResourceAsStream("/java.png");
		return IOUtils.toByteArray(in);
	}
}
