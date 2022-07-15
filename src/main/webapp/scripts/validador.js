/**
 * Vaidação de formulário
 @author Louise Tormes
 */
 
 function validar(){
	
	let nome = frmCadastro.nome.value
	let fone = frmCadastro.fone.value
	let password = frmCadastro.password.value
	let confirmpassword = frmCadastro.confirmpassword.value
	if (nome === ""){
		alert("Campo Nome obrigatorio")
		frmCadastro.nome.focus ()
		return false
	} else if (fone === ""){
		alert("Campo Fone obrigatorio")
		frmCadastro.fone.focus ()
		return false
		
		
	} else{
		document.forms["frmCadastro"].submit()
		
	}
}