package com.zx.dhtspider.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 爬虫工具测试
 * Created by flamhaze on 2017/4/5.
 */
public class SpiderUtilTest
{
    /**
     * 成功的字节转字符测试
     */
    @Test
    public void successBytesToHexStringTest()
    {
        byte[] src = new byte[]{12, 23, 66};
        String result = "0c1742";
        Assert.assertEquals(SpiderUtils.bytesToHexString(src), result, "字节转化结果不匹配");
    }

    /**
     * 失败的字节转字符测试
     */
    @Test
    public void failBytesToHexStringTest()
    {
        byte[] src = new byte[]{12, 23, 66};
        String result = "0c1741";
        Assert.assertEquals(SpiderUtils.bytesToHexString(src), result, "字节转化结果不匹配");
    }

    /**
     * 成功的Long数字转ip地址测试
     */
    @Test
    public void successLong2IpAdressTest()
    {
        long src = 2312123213L;
        String result = "137.208.51.77";
        Assert.assertEquals(SpiderUtils.long2IpAdress(src), result);
    }
}
