package utilities;

public class Locators {
    //Create account page
    public static final String LOGIN_XPATH="//a[contains(text(),'Sign in')]";
    public static final String EMAIL_ID="email_create";
    public static final String CREATE_ACCOUNT_BUTTON_ID="SubmitCreate";
    public static final String GENDER_XPATH="//div[@class='radio']/span/input[@id='id_gender1']";
    public static final String CUSTOMER_FIRSTNAME_ID="customer_firstname";
    public static final String CUSTOMER_LASTNAME_ID="customer_lastname";
    public static final String PASSWORD_ID="passwd";
    public static final String SELECT_DAYS_ID="days";
    public static final String SELECT_MONTHS_ID="months";
    public static final String SELECT_YEARS_ID="years";
    public static final String FIRSTNAME_ID="firstname";
    public static final String LASTNAME_ID="lastname";
    public static final String COMPANY_ID="company";
    public static final String ADDRESS_ID="address1";
    public static final String CITY_ID="city";
    public static final String STATE_ID="id_state";
    public static final String POSTCODE_ID="postcode";
    public static final String COUNTRY_ID="id_country";
    public static final String HOME_PHONE_ID="phone";
    public static final String MOBILE_PHONE_ID="phone_mobile";
    public static final String ALIAS_ID="alias";
    public static final String REGISTER_BUTTON_ID="submitAccount";

    public static final String WOMEN_XPATH="//a[@title='Women']";
    public static final String PRODUCT1_QUICKVIEW_XPATH="//div[@class='product-image-container']/a[@class='quick-view']";
    public static final String PRODUCT2_QUICKVIEW_XPATH="//a[@title='Blouse']/following-sibling::a[@class='quick-view']";
    public static final String PRODUCT1_QUANTITY_ID="quantity_wanted";
    public static final String ADD_TO_CART_PRODUCT1_XPATH="//a[@data-id-product='1']/span";
    public static final String ADD_TO_CART_PRODUCT2_XPATH="//a[@data-id-product='3']/span";
    public static final String ADD_TO_CART_XPATH="//p[@id='add_to_cart']/button[@type='submit']";
    public static final String CLOSE_WINDOW="//span[@class='cross']";
    public static final String CART_XPATH="//div[@class='shopping_cart']/a";
    public static final String DRESS1_XPATH="//a[contains(text(),'Faded Short')]";
    public static final String DRESS2_XPATH="//h5/a[contains(text(),'Printed Dress')]";
    public static final String ADD_QUANTITY_PRODUCT1_XPATH="//tr[contains(@id,'product_1')]/td[@class='cart_quantity text-center']/div/a[@title='Add']";
    public static final String PRODUCT1_PRICE_XPATH="//tr[contains(@id,'product_1')]/td[@class='cart_unit']/span/span[@class='price']";
    public static final String PRODUCT1_QUANTITY_XPATH="//tr[contains(@id,'product_1')]/td[@class='cart_quantity text-center']/input[@type='hidden']";
    public static final String PRODUCT1_TOTAL_XPATH="//tr[contains(@id,'product_1')]/td[@class='cart_total']/span[@class='price']";
    public static final String ADD_QUANTITY_PRODUCT2_XPATH="//tr[contains(@id,'product_3')]/td[@class='cart_quantity text-center']/div/a[@title='Add']";
    public static final String PRODUCT2_PRICE_XPATH="//tr[contains(@id,'product_3')]/td[@class='cart_unit']/span/span[@class='price']";
    public static final String PRODUCT2_QUANTITY_XPATH="//tr[contains(@id,'product_3')]/td[@class='cart_quantity text-center']/input[@type='hidden']";
    public static final String PRODUCT2_TOTAL_XPATH="//tr[contains(@id,'product_3')]/td[@class='cart_total']/span[@class='price']";
    public static final String PRODUCTS_TOTAL_XPATH="//td[@id='total_product']";
    public static final String PRODUCTS_SHIPPING_TOTAL_XPATH="//td[@id='total_shipping']";
    public static final String PRODUCTS_GROSS_TOTAL_XPATH="//td[@id='total_price_container']/span";

    public static final String PROCEED_TO_CHECKOUT_XPATH="//a[@title='Proceed to checkout']";
    public static final String SUBMIT_XPATH="//button[@type='submit']";
    public static final String CHECKBOX_ID="cgv";
    public static final String PAY_BY_WIRE_XPATH="//a[@class='bankwire']";
    //Payment Details
}
