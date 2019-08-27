package com.tws.refactoring.extract_variable;

import static org.junit.Assert.*;

import org.junit.Test;

public class BannerRenderTest {
	@Test
	public void should_return_IE_on_Mac_when_renderBanner_given_platform_and_brower(){
		//given
		BannerRender bannerRender = new BannerRender();
		String platform = "mac";
		String brower = "ie";
		//when
		String result = bannerRender.renderBanner(platform,brower);
		//then
		assertEquals("IE on Mac?",result);
	}
	@Test
	public void should_return_banner_when_renderBanner_given_platform_and_brower(){
		//given
		BannerRender bannerRender = new BannerRender();
		String platform = "windows";
		String brower = "ie";
		//when
		String result = bannerRender.renderBanner(platform,brower);
		//then
		assertEquals("banner",result);
	}

}


