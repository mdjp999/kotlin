/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.defaultConstructor;

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
@TestMetadata("compiler/testData/codegen/defaultArguments/reflection")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DefaultArgumentsReflectionTestGenerated extends AbstractDefaultArgumentsReflectionTest {
    public void testAllFilesPresentInReflection() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/defaultArguments/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("classInClassObject.kt")
    public void testClassInClassObject() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/classInClassObject.kt", this::doTest);
    }

    @TestMetadata("classInObject.kt")
    public void testClassInObject() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/classInObject.kt", this::doTest);
    }

    @TestMetadata("classWithTwoDefaultArgs.kt")
    public void testClassWithTwoDefaultArgs() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/classWithTwoDefaultArgs.kt", this::doTest);
    }

    @TestMetadata("classWithVararg.kt")
    public void testClassWithVararg() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/classWithVararg.kt", this::doTest);
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/enum.kt", this::doTest);
    }

    @TestMetadata("internalClass.kt")
    public void testInternalClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/internalClass.kt", this::doTest);
    }

    @TestMetadata("privateClass.kt")
    public void testPrivateClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/privateClass.kt", this::doTest);
    }

    @TestMetadata("privateConstructor.kt")
    public void testPrivateConstructor() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/privateConstructor.kt", this::doTest);
    }

    @TestMetadata("publicClass.kt")
    public void testPublicClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/publicClass.kt", this::doTest);
    }

    @TestMetadata("publicClassWoDefArgs.kt")
    public void testPublicClassWoDefArgs() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/publicClassWoDefArgs.kt", this::doTest);
    }

    @TestMetadata("publicInnerClass.kt")
    public void testPublicInnerClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/publicInnerClass.kt", this::doTest);
    }

    @TestMetadata("publicInnerClassInPrivateClass.kt")
    public void testPublicInnerClassInPrivateClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/codegen/defaultArguments/reflection/publicInnerClassInPrivateClass.kt", this::doTest);
    }
}
