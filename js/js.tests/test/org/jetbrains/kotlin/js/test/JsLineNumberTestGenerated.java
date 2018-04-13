/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/lineNumbers")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsLineNumberTestGenerated extends AbstractJsLineNumberTest {
    public void testAllFilesPresentInLineNumbers() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/lineNumbers"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("andAndWithSideEffect.kt")
    public void testAndAndWithSideEffect() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/andAndWithSideEffect.kt", this::doTest);
    }

    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/backingField.kt", this::doTest);
    }

    @TestMetadata("catch.kt")
    public void testCatch() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/catch.kt", this::doTest);
    }

    @TestMetadata("chainedCall.kt")
    public void testChainedCall() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/chainedCall.kt", this::doTest);
    }

    @TestMetadata("classCapturingLocals.kt")
    public void testClassCapturingLocals() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/classCapturingLocals.kt", this::doTest);
    }

    @TestMetadata("closure.kt")
    public void testClosure() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/closure.kt", this::doTest);
    }

    @TestMetadata("complexExpressionAsDefaultArgument.kt")
    public void testComplexExpressionAsDefaultArgument() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/complexExpressionAsDefaultArgument.kt", this::doTest);
    }

    @TestMetadata("conditionalDecomposed.kt")
    public void testConditionalDecomposed() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/conditionalDecomposed.kt", this::doTest);
    }

    @TestMetadata("coroutine.kt")
    public void testCoroutine() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/coroutine.kt", this::doTest);
    }

    @TestMetadata("coroutineNullAssertion.kt")
    public void testCoroutineNullAssertion() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/coroutineNullAssertion.kt", this::doTest);
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/dataClass.kt", this::doTest);
    }

    @TestMetadata("delegateMemberVal.kt")
    public void testDelegateMemberVal() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/delegateMemberVal.kt", this::doTest);
    }

    @TestMetadata("delegatedProperty.kt")
    public void testDelegatedProperty() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/delegatedProperty.kt", this::doTest);
    }

    @TestMetadata("delegation.kt")
    public void testDelegation() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/delegation.kt", this::doTest);
    }

    @TestMetadata("destructuring.kt")
    public void testDestructuring() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/destructuring.kt", this::doTest);
    }

    @TestMetadata("destructuringInline.kt")
    public void testDestructuringInline() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/destructuringInline.kt", this::doTest);
    }

    @TestMetadata("doWhileWithComplexCondition.kt")
    public void testDoWhileWithComplexCondition() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/doWhileWithComplexCondition.kt", this::doTest);
    }

    @TestMetadata("elvis.kt")
    public void testElvis() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/elvis.kt", this::doTest);
    }

    @TestMetadata("enumCompanionObject.kt")
    public void testEnumCompanionObject() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/enumCompanionObject.kt", this::doTest);
    }

    @TestMetadata("enumObject.kt")
    public void testEnumObject() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/enumObject.kt", this::doTest);
    }

    @TestMetadata("expressionAsFunctionBody.kt")
    public void testExpressionAsFunctionBody() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/expressionAsFunctionBody.kt", this::doTest);
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/for.kt", this::doTest);
    }

    @TestMetadata("increment.kt")
    public void testIncrement() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/increment.kt", this::doTest);
    }

    @TestMetadata("inlineArguments.kt")
    public void testInlineArguments() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inlineArguments.kt", this::doTest);
    }

    @TestMetadata("inlineLocalVarsRef.kt")
    public void testInlineLocalVarsRef() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inlineLocalVarsRef.kt", this::doTest);
    }

    @TestMetadata("inlineReturn.kt")
    public void testInlineReturn() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inlineReturn.kt", this::doTest);
    }

    @TestMetadata("inlining.kt")
    public void testInlining() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inlining.kt", this::doTest);
    }

    @TestMetadata("inliningWithLambda.kt")
    public void testInliningWithLambda() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inliningWithLambda.kt", this::doTest);
    }

    @TestMetadata("innerClass.kt")
    public void testInnerClass() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/innerClass.kt", this::doTest);
    }

    @TestMetadata("isOperator.kt")
    public void testIsOperator() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/isOperator.kt", this::doTest);
    }

    @TestMetadata("jsCode.kt")
    public void testJsCode() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/jsCode.kt", this::doTest);
    }

    @TestMetadata("lambdaWithClosure.kt")
    public void testLambdaWithClosure() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/lambdaWithClosure.kt", this::doTest);
    }

    @TestMetadata("lastExpressionInInlineLambda.kt")
    public void testLastExpressionInInlineLambda() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/lastExpressionInInlineLambda.kt", this::doTest);
    }

    @TestMetadata("literals.kt")
    public void testLiterals() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/literals.kt", this::doTest);
    }

    @TestMetadata("longLiteral.kt")
    public void testLongLiteral() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/longLiteral.kt", this::doTest);
    }

    @TestMetadata("memberFunWithDefaultParam.kt")
    public void testMemberFunWithDefaultParam() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/memberFunWithDefaultParam.kt", this::doTest);
    }

    @TestMetadata("multipleReferences.kt")
    public void testMultipleReferences() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/multipleReferences.kt", this::doTest);
    }

    @TestMetadata("objectInstanceFunction.kt")
    public void testObjectInstanceFunction() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/objectInstanceFunction.kt", this::doTest);
    }

    @TestMetadata("optionalArgs.kt")
    public void testOptionalArgs() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/optionalArgs.kt", this::doTest);
    }

    @TestMetadata("propertyWithoutInitializer.kt")
    public void testPropertyWithoutInitializer() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/propertyWithoutInitializer.kt", this::doTest);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/simple.kt", this::doTest);
    }

    @TestMetadata("stringLiteral.kt")
    public void testStringLiteral() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/stringLiteral.kt", this::doTest);
    }

    @TestMetadata("syntheticCodeInConstructors.kt")
    public void testSyntheticCodeInConstructors() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/syntheticCodeInConstructors.kt", this::doTest);
    }

    @TestMetadata("syntheticCodeInEnums.kt")
    public void testSyntheticCodeInEnums() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/syntheticCodeInEnums.kt", this::doTest);
    }

    @TestMetadata("valParameter.kt")
    public void testValParameter() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/valParameter.kt", this::doTest);
    }

    @TestMetadata("whenEntryWithMultipleConditions.kt")
    public void testWhenEntryWithMultipleConditions() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/whenEntryWithMultipleConditions.kt", this::doTest);
    }

    @TestMetadata("whenEntryWithMultipleConditionsNonOptimized.kt")
    public void testWhenEntryWithMultipleConditionsNonOptimized() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/whenEntryWithMultipleConditionsNonOptimized.kt", this::doTest);
    }

    @TestMetadata("whenIn.kt")
    public void testWhenIn() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/whenIn.kt", this::doTest);
    }

    @TestMetadata("whenIs.kt")
    public void testWhenIs() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/whenIs.kt", this::doTest);
    }

    @TestMetadata("whileWithComplexCondition.kt")
    public void testWhileWithComplexCondition() throws Exception {
        KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/whileWithComplexCondition.kt", this::doTest);
    }

    @TestMetadata("js/js.translator/testData/lineNumbers/inlineMultiModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineMultiModule extends AbstractJsLineNumberTest {
        public void testAllFilesPresentInInlineMultiModule() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/lineNumbers/inlineMultiModule"), Pattern.compile("^([^_](.+))\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            KotlinTestUtils.runTest("js/js.translator/testData/lineNumbers/inlineMultiModule/simple.kt", this::doTest);
        }
    }
}
