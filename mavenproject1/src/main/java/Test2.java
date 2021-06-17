/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Isa H
 */
import java.io.IOException;
public class Test2 {
    public static void main(String[] args){
        SendSms sendsms=new SendSms();
sendsms.init();

sendsms.server = "https://sample.smshosts.com/";

sendsms.user = "username";

sendsms.password = "password";

sendsms.phonenumber = "+2348083333523";

sendsms.text = "This is a test message";

sendsms.send();
    }
}
