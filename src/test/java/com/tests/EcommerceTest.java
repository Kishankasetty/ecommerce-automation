package com.tests;

import com.base.BaseTest;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class EcommerceTest extends BaseTest {

    @Test
    public void testFlow() throws InterruptedException {

		LoginPage login = new LoginPage(driver);
        ProductPage product = new ProductPage(driver);

        login.login("standard_user", "secret_sauce");
        Thread.sleep(3000);
        product.addToCart();
        Thread.sleep(3000);
        product.goToCart();
        Thread.sleep(3000);
    }
}