package org.example;

import org.example.laba2.Expressions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpressionTest {
    /**
     * Тест на простое выражение
     */
    @Test
    void SimpleExpressionTest(){
        String expression="4+5";
        Assertions.assertEquals(9, Expressions.evaluateExpression(expression));

    }
    @Test
    void HardExpresionTest(){
        String expresion= "5*5+25*3-6/2";// 25+75-3=97
        Assertions.assertEquals(97,Expressions.evaluateExpression(expresion));
    }
    @Test
    void HardExpressionWithTest(){
        String expression="2*(5+3)-7*(4*8)";//2 *(8)-7*(32)=16-224=-208
        Assertions.assertEquals(-208,Expressions.evaluateExpression(expression));
    }
    @Test
    void IsNullTest(){
        String expression="";
        Assertions.assertThrows( IllegalArgumentException.class,()->Expressions.evaluateExpression(expression));
    }
    @Test
    void IllegalOperatorTest(){
        String expression="5&4";
        Assertions.assertThrows( IllegalArgumentException.class,()->Expressions.evaluateExpression(expression));

    }

}
