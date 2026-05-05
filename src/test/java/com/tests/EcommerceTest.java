package com.tests;

import com.base.BaseTest;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.pages.ProductPage;

public class EcommerceTest extends BaseTest {

    @Test
    public void testFlow() {

		LoginPage login = new LoginPage(driver);
        ProductPage product = new ProductPage(driver);

        login.login("standard_user", "secret_sauce");
        
        product.addToCart();
        
        product.goToCart();
        
    }
}