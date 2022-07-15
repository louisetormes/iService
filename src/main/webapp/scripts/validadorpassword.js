/**
 * Validação de senha do formulário
 @author Louise Tormes
 */
 
 /**
 * Vaidação de formulário
 @author Louise Tormes
 */
 
 function validar(){
	
	let password = frmCadastro.password.value
	let confirmpassword = frmCadastro.confirmpassword.value
	if (password < 8 ){
		alert("Campo password deve ter 8 caracteres")
		frmCadastro.password.focus ()
		return false
	} else if (confirmpassword === ""){
		alert("Campo confirmpassword obrigatorio")
		frmCadastro.fone.focus ()
		return false
		
		
	} else{
		document.forms["frmCadastro"].submit()
		
	}
}