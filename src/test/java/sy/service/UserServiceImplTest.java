package sy.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.reflect.Whitebox;

import sy.dao.UserMapper;
import sy.model.User;

public class UserServiceImplTest {
	
	private UserServiceImpl userService;
	
	private UserMapper userMapper;
	
	@Before
	public void setUp(){
		userService = PowerMockito.spy(new UserServiceImpl());
		userMapper = PowerMockito.mock(UserMapper.class);
		Whitebox.setInternalState(userService, "userMapper", userMapper);
	}
	
	@Test
	public void testGetUserById()
	{	
		User user = new User();
		PowerMockito.when(userMapper.selectByPrimaryKey(Mockito.anyString())).thenReturn(user);
		Assert.assertEquals(user, userService.getUserById("123"));
	}
}
