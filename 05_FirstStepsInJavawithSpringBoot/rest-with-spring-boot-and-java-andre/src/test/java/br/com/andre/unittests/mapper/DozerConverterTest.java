package br.com.andre.unittests.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.andre.data.vo.v2.PersonVOV2;
import br.com.andre.mapper.DozerMapper;
import br.com.andre.model.Person;
import br.com.andre.unittests.mapper.mocks.MockPerson;

public class DozerConverterTest {
	
	MockPerson inputObject;
	
	@BeforeEach
	public void setUp() {
		inputObject = new MockPerson();
	}
	
	@Test
	public void parseEntityToVOTest() {
		PersonVOV2 output = DozerMapper.parseObject(inputObject.mockEntity(), PersonVOV2.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test 0", output.getFirstName());
		assertEquals("Last Name Test 0", output.getLastName());
		assertEquals("Addres Test 0", output.getAddress());
		assertEquals("Male", output.getGender());
	}
	
	@Test
	public void parseEntityListToVOListTest() {
		List<PersonVOV2> outputList = DozerMapper.parseListObject(inputObject.mockEntityList(), PersonVOV2.class);
		
		PersonVOV2 outputZero = outputList.get(0);
		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test 0", outputZero.getFirstName());
		assertEquals("Last Name Test 0", outputZero.getLastName());
		assertEquals("Addres Test 0", outputZero.getAddress());
		assertEquals("Male", outputZero.getGender());
		
		PersonVOV2 outputSeven = outputList.get(7);
		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test 7", outputSeven.getFirstName());
		assertEquals("Last Name Test 7", outputSeven.getLastName());
		assertEquals("Addres Test 7", outputSeven.getAddress());
		assertEquals("Female", outputSeven.getGender());

		PersonVOV2 outputTwelve = outputList.get(12);
		assertEquals(Long.valueOf(12L), outputTwelve.getId());
		assertEquals("First Name Test 12", outputTwelve.getFirstName());
		assertEquals("Last Name Test 12", outputTwelve.getLastName());
		assertEquals("Addres Test 12", outputTwelve.getAddress());
		assertEquals("Male", outputTwelve.getGender());
	}
	
	@Test
	public void parseVOToEntityTest() {
		Person output = DozerMapper.parseObject(inputObject.mockVO(), Person.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test 0", output.getFirstName());
		assertEquals("Last Name Test 0", output.getLastName());
		assertEquals("Addres Test 0", output.getAddress());
		assertEquals("Male", output.getGender());
	}
	
	@Test
	public void parseVOListToEntityListTest() {
		List<Person> outputList = DozerMapper.parseListObject(inputObject.mockVOList(), Person.class);
		
		Person outputZero = outputList.get(0);
		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test 0", outputZero.getFirstName());
		assertEquals("Last Name Test 0", outputZero.getLastName());
		assertEquals("Addres Test 0", outputZero.getAddress());
		assertEquals("Male", outputZero.getGender());
		
		Person outputSeven = outputList.get(7);
		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test 7", outputSeven.getFirstName());
		assertEquals("Last Name Test 7", outputSeven.getLastName());
		assertEquals("Addres Test 7", outputSeven.getAddress());
		assertEquals("Female", outputSeven.getGender());
		
		Person outputTwelve = outputList.get(12);
		assertEquals(Long.valueOf(12L), outputTwelve.getId());
		assertEquals("First Name Test 12", outputTwelve.getFirstName());
		assertEquals("Last Name Test 12", outputTwelve.getLastName());
		assertEquals("Addres Test 12", outputTwelve.getAddress());
		assertEquals("Male", outputTwelve.getGender());
	}

}