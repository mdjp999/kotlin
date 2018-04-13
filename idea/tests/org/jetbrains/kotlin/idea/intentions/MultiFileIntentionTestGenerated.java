/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.intentions;

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
@TestMetadata("idea/testData/multiFileIntentions")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiFileIntentionTestGenerated extends AbstractMultiFileIntentionTest {
    @TestMetadata("addJvmStaticToCompanionObjectFun/addJvmStaticToCompanionObjectFun.test")
    public void testAddJvmStaticToCompanionObjectFun_AddJvmStaticToCompanionObjectFun() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToCompanionObjectFun/addJvmStaticToCompanionObjectFun.test", this::doTest);
    }

    @TestMetadata("addJvmStaticToCompanionObjectProperty/addJvmStaticToCompanionObjectProperty.test")
    public void testAddJvmStaticToCompanionObjectProperty_AddJvmStaticToCompanionObjectProperty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToCompanionObjectProperty/addJvmStaticToCompanionObjectProperty.test", this::doTest);
    }

    @TestMetadata("addJvmStaticToNamedCompanionObjectFun/addJvmStaticToNamedCompanionObjectFun.test")
    public void testAddJvmStaticToNamedCompanionObjectFun_AddJvmStaticToNamedCompanionObjectFun() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToNamedCompanionObjectFun/addJvmStaticToNamedCompanionObjectFun.test", this::doTest);
    }

    @TestMetadata("addJvmStaticToNamedCompanionObjectProperty/addJvmStaticToNamedCompanionObjectProperty.test")
    public void testAddJvmStaticToNamedCompanionObjectProperty_AddJvmStaticToNamedCompanionObjectProperty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToNamedCompanionObjectProperty/addJvmStaticToNamedCompanionObjectProperty.test", this::doTest);
    }

    @TestMetadata("addJvmStaticToObjectFun/addJvmStaticToObjectFun.test")
    public void testAddJvmStaticToObjectFun_AddJvmStaticToObjectFun() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToObjectFun/addJvmStaticToObjectFun.test", this::doTest);
    }

    @TestMetadata("addJvmStaticToObjectProperty/addJvmStaticToObjectProperty.test")
    public void testAddJvmStaticToObjectProperty_AddJvmStaticToObjectProperty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/addJvmStaticToObjectProperty/addJvmStaticToObjectProperty.test", this::doTest);
    }

    public void testAllFilesPresentInMultiFileIntentions() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/multiFileIntentions"), Pattern.compile("^(.+)\\.test$"), TargetBackend.ANY);
    }

    @TestMetadata("convertMemberToExtension/addImports/addImports.test")
    public void testConvertMemberToExtension_addImports_AddImports() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/convertMemberToExtension/addImports/addImports.test", this::doTest);
    }

    @TestMetadata("implementAbstractMember/implementFunctionInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementFunctionInJava_ImplementAllInJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/implementAbstractMember/implementFunctionInJava/implementAllInJava.test", this::doTest);
    }

    @TestMetadata("implementAbstractMember/implementValInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementValInJava_ImplementAllInJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/implementAbstractMember/implementValInJava/implementAllInJava.test", this::doTest);
    }

    @TestMetadata("implementAbstractMember/implementVarInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementVarInJava_ImplementAllInJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/implementAbstractMember/implementVarInJava/implementAllInJava.test", this::doTest);
    }

    @TestMetadata("implementAsConstructorParameter/implementValInJava/implementAllInJava.test")
    public void testImplementAsConstructorParameter_implementValInJava_ImplementAllInJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/implementAsConstructorParameter/implementValInJava/implementAllInJava.test", this::doTest);
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToExistingFile/moveClassToExistingFile.test")
    public void testMoveDeclarationToSeparateFile_moveClassToExistingFile_MoveClassToExistingFile() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToExistingFile/moveClassToExistingFile.test", this::doTest);
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToFile/moveClassToFile.test")
    public void testMoveDeclarationToSeparateFile_moveClassToFile_MoveClassToFile() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToFile/moveClassToFile.test", this::doTest);
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToFileInDefaultPackage/moveClassToFileInDefaultPackage.test")
    public void testMoveDeclarationToSeparateFile_moveClassToFileInDefaultPackage_MoveClassToFileInDefaultPackage() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToFileInDefaultPackage/moveClassToFileInDefaultPackage.test", this::doTest);
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveSingleToFile/moveSingleToFile.test")
    public void testMoveDeclarationToSeparateFile_moveSingleToFile_MoveSingleToFile() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveDeclarationToSeparateFile/moveSingleToFile/moveSingleToFile.test", this::doTest);
    }

    @TestMetadata("moveDeclarationToSeparateFile/optimizeImports/optimizeImports.test")
    public void testMoveDeclarationToSeparateFile_optimizeImports_OptimizeImports() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveDeclarationToSeparateFile/optimizeImports/optimizeImports.test", this::doTest);
    }

    @TestMetadata("moveOutOfCompanion/moveClass/moveClass.test")
    public void testMoveOutOfCompanion_moveClass_MoveClass() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveOutOfCompanion/moveClass/moveClass.test", this::doTest);
    }

    @TestMetadata("moveToCompanion/moveFunction/moveFunction.test")
    public void testMoveToCompanion_moveFunction_MoveFunction() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveToCompanion/moveFunction/moveFunction.test", this::doTest);
    }

    @TestMetadata("moveToCompanion/moveInnerClass/moveInnerClass.test")
    public void testMoveToCompanion_moveInnerClass_MoveInnerClass() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveToCompanion/moveInnerClass/moveInnerClass.test", this::doTest);
    }

    @TestMetadata("moveToCompanion/moveNonInnerClass/moveNonInnerClass.test")
    public void testMoveToCompanion_moveNonInnerClass_MoveNonInnerClass() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveToCompanion/moveNonInnerClass/moveNonInnerClass.test", this::doTest);
    }

    @TestMetadata("moveToCompanion/moveProperty/moveProperty.test")
    public void testMoveToCompanion_moveProperty_MoveProperty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/moveToCompanion/moveProperty/moveProperty.test", this::doTest);
    }

    @TestMetadata("objectLiteralToLambda/objectLiteralToLambda.test")
    public void testObjectLiteralToLambda_ObjectLiteralToLambda() throws Exception {
        KotlinTestUtils.runTest("idea/testData/multiFileIntentions/objectLiteralToLambda/objectLiteralToLambda.test", this::doTest);
    }
}
