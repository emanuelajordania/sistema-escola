package br.com.manu.escola;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class EmailTest {

	@Test
	void naoDeveriaCriarEmailComEnderecoInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null));
		assertThrows(IllegalArgumentException.class,
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class,
				() -> new Email("emailstringqualquer"));
	}

}
