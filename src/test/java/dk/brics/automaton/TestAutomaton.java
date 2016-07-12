
package dk.brics.automaton;

import org.junit.Test;

public class TestAutomaton {

    @Test
    public void test() {
        final String reg = ".*foo.*|a.*";
        /*
        final String reg = ".*security-police-warning.com.*|.*mamina-shkola.org.*|.*on-line-office.com.*|.*newsalo.ru.*|.*gipertoniya-stops.org.*|.*newsalo.com.*" //
                + "|.*police-alert-warning.com.*|.*salosalo.ru.*|.*gipertonia-stop.ru.*" //
                + "|.*cistit-stops.org.*" //
                + "|.*jmk-cold.biz.*|.*PREMIUM-LOADS1337.BIZ.*|.*PREMIUM-LOADS.BIZ.*|.*loads1337.ru.*" //
        ;
        final String reg = "(.*security-police-warning.com.*|.*mamina-shkola.org.*|.*on-line-office.com.*|.*newsalo.ru.*)|a.*";
        final String s1 = "*security-police-warning.com*,*mamina-shkola.org*,*on-line-office.com*,*newsalo.ru*,*gipertoniya-stops.org*,*newsalo.com*" //
                + ",*police-alert-warning.com*,*salosalo.ru*,*gipertonia-stop.ru*" //
                + ",*cistit-stops.org*" //
                + ",*jmk-cold.biz*,*PREMIUM-LOADS1337.BIZ*,*PREMIUM-LOADS.BIZ*,*loads1337.ru*" //
        ;
        //final String reg = s1.replaceAll(",", "|").replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");
        final String reg = ".*(" + s1.replaceAll(",", "|").replaceAll("\\.", "\\\\.").replaceAll("\\*", "") + ").*";
        /*  */
        System.out.println(reg);
        final RegExp regExp = new RegExp(reg);
        final Automaton automaton = regExp.toAutomaton();
        System.out.println(automaton);
    }
}
