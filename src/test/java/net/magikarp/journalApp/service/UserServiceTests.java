package net.magikarp.journalApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.magikarp.journalApp.repository.UserRepository;

@SpringBootTest
public class UserServiceTests{

    @Autowired
    private UserRepository userRepository;

    public UserServiceTests() {
    }
    
    @Disabled
    @Test
    public void testFindByUserName(){
        assertEquals(4, 2+2);
        assertNotNull(userRepository.findByUserName("Ram"));
    }

    @ParameterizedTest
    @CsvSource({
        "1,1,2",
        "2,10,12",
        "3,3,9",
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b, "failed for:" + expected);
    }

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void test1(){
        
    }

    @ParameterizedTest
    @ValueSource(strings={
        "ram",
        "shyam"
    })
    public void test2(){

    }
}
