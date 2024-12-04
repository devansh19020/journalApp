package net.magikarp.journalApp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.magikarp.journalApp.repository.UserRepository;

//@ActiveProfiles("dev") to specify which profile code is to be tested
public class UserDetailsServiceImplTests {
    @InjectMocks
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Mock                  //If we want to use springboot context too then injectmocks = autowired mock = mockBean
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void liadUserbyUsernameTest(){
        // when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("ram").password("jsgkjg").build());
        
    }
}
