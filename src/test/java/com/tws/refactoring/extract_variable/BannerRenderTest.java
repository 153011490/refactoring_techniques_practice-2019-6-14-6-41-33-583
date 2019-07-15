package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_banner_when_call_renderBanner_given_unMatch_platform_browser() {

        //given
        BannerRender bannerRender=new BannerRender();
        String platform="Windows";
        String browser="Google";

        //when
        String actual = bannerRender.renderBanner(platform, browser);

        //then
        assertEquals("banner",actual);

    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_Match_platform_unMatch_browser() {

        //given
        BannerRender bannerRender=new BannerRender();
        String platform="MACOS10";
        String browser="Google";

        //when
        String actual = bannerRender.renderBanner(platform, browser);

        //then
        assertEquals("banner",actual);

    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_unMatch_platform_Match_browser() {

        //given
        BannerRender bannerRender=new BannerRender();
        String platform="Windows";
        String browser="IE10";

        //when
        String actual = bannerRender.renderBanner(platform, browser);

        //then
        assertEquals("banner",actual);

    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_Match_platform_Match_browser() {

        //given
        BannerRender bannerRender=new BannerRender();
        String platform="MACOS10";
        String browser="IE10";

        //when
        String actual = bannerRender.renderBanner(platform, browser);

        //then
        assertEquals("IE on Mac?",actual);

    }

}