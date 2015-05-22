/*
 * generated by Xtext
 */
package org.osate.verify.generator

import java.util.HashSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.osate.verify.verify.Verification
import org.osate.verify.verify.VerificationActivity
import org.osate.verify.verify.VerificationMethodRegistry

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class VerifyGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		val content = (resource.contents.get(0) as Verification).contents
//		val vll = content.filter[el | el instanceof VerificationLibrary].map[vl| vl as VerificationLibrary]
//		vll.forEach[mylib| addedImports.clear
//			fsa.generateFile('''«mylib.name»/«mylib.name».java''', mylib.generate)
//		]
	}
	
	def dispatch String generate(VerificationMethodRegistry vmr){
		
	}
	val addedImports = new HashSet<String>
	
	
//	def dispatch String generate(VerificationLibrary vl){
//'''
//package «vl.name»;
//import org.osate.aadl2.instance.ComponentInstance;
//import org.junit.Test;
//««««FOR el : vl.content»
//««««el.generateImports»
//««««ENDFOR»
//
//class «vl.name» {
//	«FOR el : vl.content»
//	«el.generate»
//	«ENDFOR»
//}
//'''
//	}
	
	
	// should it be impl
	def dispatch String generate(VerificationActivity va){
		'''
		@Test
		public void «va.name» (ComponentInstance ci){
			org.junit.Assert.assertTrue(«va.method.methodPath»(ci));
		}
		'''
		//mnam need more code
	}
	
	 
	def dispatch String generateImports(VerificationActivity va){
		val themethod = va.method?.methodPath
		if (themethod != null && addedImports.add(themethod)) {
			val substr = themethod.lastIndexOf('.');
			'''import «themethod.substring(0,themethod.lastIndexOf('.'))»;
			'''
		}
	}
	
}