package com.test.obstest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Addcustomer.class, Deletecustomer.class, Updatecustomer.class, Viewcustomer.class })
public class AllCustomer {

}
