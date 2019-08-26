package com.vinicpinheiro.vini;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.vinicpinheiro.vini.dto.ErroTratado;

@ControllerAdvice
public class ExcpetionInterceptor {
	
	
		
		@ResponseStatus(code = HttpStatus.BAD_REQUEST)
		@ExceptionHandler(Exception.class)
		@ResponseBody
		public ErroTratado handle(Exception ex) {
			String msg = ex.getMessage();
			ErroTratado erro = new ErroTratado();
			erro.setCodErro("10");
			erro.setMsg(msg);
			return erro;
			
		}
	

}
