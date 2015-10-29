package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;

public class GoSafeProtocolDecoderTest extends ProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        GoSafeProtocolDecoder decoder = new GoSafeProtocolDecoder(new GoSafeProtocol());

        verifyPositions(decoder, text(
                "*GS16,351535059439208,083515281015,,GPS:A;9;N31.959502;E35.908316;;108;890;1.05;1.79,GSM:1;4;416;3;AF0;A3A6;-59;416;3;AF0;A3A3;-50;416;3;AF0;A3A4;-56;416;3;AF0;A3A5;-62;416;3;AF0;B195;-76,OBD:04410C194603410D2303411C0103410583037F011203411115"));

        verifyNothing(decoder, text(
                "*GS16,351535058709775"));
        
        verifyPositions(decoder, text(
                "*GS16,351535059439208,103441131015,,GPS:A;8;N31.960122;E35.921652;27;99;847;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-61;416;3;AF0;9C89;-68,OBD:04410C0DA403410D0B03411C010341057A037F011203411100$103453131015,,GPS:A;8;N31.959976;E35.922144;6;0;835;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D8E03410D0B03411C010341057D037F011203411100$103503131015,,GPS:A;9;N31.959870;E35.922284;11;127;830;1.33;2.41,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D8E03410D0B03411C010341057D037F011203411100$103513131015,,GPS:A;9;N31.959742;E35.922516;10;106;830;1.37;2.91,GSM:1;4;416;3;AF0;9C73;-67;416;3;AF0;9C89;-64;416;3;AF0;B389;-83,OBD:04410C0D1003410D0603411C010341057E037F011203411100$103553131015,,GPS:A;8;N31.959564;E35.923308;6;0;836;1.41;2.43,GSM:1;4;416;3;AF0;9C73;-65;416;3;AF0;B389;-71;416;3;AF0;9C89;-74,OBD:04410C0DAE03410D0403411C010341057C037F011203411100#"));

        verifyPositions(decoder, text(
                "*GS16,351535058709775,100356130215,,SYS:G79W;V1.06;V1.0.2,GPS:A;6;N24.802700;E46.616828;0;0;684;1.35,COT:60,ADC:4.31;0.10,DTT:20000;;0;0;0;1"));
        
        verifyPositions(decoder, text(
                "*GS16,351535059439208,155750220815,,SYS:G79;V1.10;V1.0.2,GPS:A;4;N31.944198;E35.846644;0;0;923;9.47;1.00,COT:155133,ADC:12.21;0.10,DTT:20002;;0;0;0;1#"));
        
        verifyPositions(decoder, text(
                "*GS16,351535059439208,070034220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945970;E35.859848;29;65;922;1.14;1.68,COT:147528,ADC:14.07;0.11,DTT:27006;;0;0;0;3,OBD:04410C1ECD03410D2D03411C010341057A037F011203411107$070035220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945934;E35.859908;29;86;922;1.14;1.68,COT:147528,ADC:13.94;0.15,DTT:27006;;0;0;0;3,OBD:04410C1ECD03410D2D03411C010341057A037F011203411107$070037220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945844;E35.859952;29;123;922;1.14;1.68,COT:147625,ADC:13.75;0.11,DTT:27006;;0;0;0;3,OBD:04410C0FE803410D1803411C010341057C037F011203411100$070038220815,,SYS:G79;V1.10;V1.0.2,GPS:A;8;N31.945808;E35.859940;29;145;923;1.14;1.68,COT:147625,ADC:14.00;0.11,DTT:27006;;0;0;0;3,OBD:04410C0FE803410D1803411C010341057C037F011203411100#"));

    }

}
