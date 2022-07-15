/**
 * Vaidação de formulário
 @author Louise Tormes
 */
 
 function validar(){
	
	let nome = frmCadastro.nome.value
	let password = frmCadastro.password.value
	if (nome === ""){
		alert("Campo Nome obrigatorio")
		frmCadastro.nome.focus ()
		return false
	} else if (password === ""){
		alert("Campo Password obrigatorio")
		frmCadastro.password.focus ()
		return false
		
		
	} else{
		document.forms["frmCadastro"].submit()
		
	}
}/**
 * 
 */