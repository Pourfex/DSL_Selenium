/*
 * generated by Xtext 2.15.0
 */
package org.xtext.imt.browserautomation.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.imt.browserautomation.browserAutomation.TestSuites

@ExtendWith(InjectionExtension)
@InjectWith(BrowserAutomationInjectorProvider)
class BrowserAutomationParsingTest {
	@Inject
	ParseHelper<TestSuites> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}
