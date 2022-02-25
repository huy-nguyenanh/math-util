/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huy.mathutil.test;

import static com.huy.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 84399
 */
public class MathUtilTest {
    
    //Test case #1: getF() with valid argument
    //n = 0, expected = 1; actual: đoán xem!!!
    @Test //@Test biến 1 hàm bất kì trong 1 class bất kì thành main()
    public void testFactorialGivenValidArgumentReturnsWell() {
        
        long expected = 1; //hy vọng hàm trả về 1 nếu tính 0!
        long actual = getFactorial(0);
        
        assertEquals(expected, actual);
        //~~~ trong main() kiểu cũ, ta in ra kết quả expected và actual
        //mắt tự nhìn để coi 2 thằng giống nhau hay ko
        //bên JUnit, tung 2 màu sắc: XANH: 2 thằng khớp nhau
        //                           ĐỎ  : 2 thằng ko khớp nhau
    } 
    
    @Test 
    //Test case #2: getF() with valid argument
    //n = 6, expected = 720; actual: đoán xem!!!
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        
        long expected = 720; //hy vọng hàm trả về 720 nếu tính 6!
        long actual = getFactorial(6);        
        assertEquals(expected, actual);       
    } 
    
    //NGOẠI LỆ THÌ LÀM SAO ĐỂ TEST
    //NHỚ LÀ: NGOẠI LỆ KO PHẢI LÀ 1 VALUE
    //NGOẠI LỆ LÀ 1 TÌNH HUỐNG, THỨ GÌ ĐÓ BẤT THƯỜNG, CÓ KHẢ NĂNG XUẤT/XẢY RA
    //KO LÀ VALUE ĐỂ SO SÁNH KIỂU assertEquals()
    //ngoại lệ ko dùng hàm assertEquals()
    //chỉ đo lường = cách coi mày có xh hay ko???
    
    @Test(expected = IllegalArgumentException.class) //xanh nha em
    //Test case #3: getF() with invalid argument
    //n = -5, expected = ngoại lệ phải xuất hiện!!!
    public void testFactorialGivenInvalidArgumentThrowsException() {        
        
        getFactorial(-5);
    } 
    
}
