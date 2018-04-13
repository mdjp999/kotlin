/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.highlighter;

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
@TestMetadata("idea/testData/highlighter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class HighlightingTestGenerated extends AbstractHighlightingTest {
    public void testAllFilesPresentInHighlighter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/highlighter"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("Annotations.kt")
    public void testAnnotations() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Annotations.kt", this::doTest);
    }

    @TestMetadata("Dynamic.kt")
    public void testDynamic() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Dynamic.kt", this::doTest);
    }

    @TestMetadata("Enums.kt")
    public void testEnums() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Enums.kt", this::doTest);
    }

    @TestMetadata("Field.kt")
    public void testField() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Field.kt", this::doTest);
    }

    @TestMetadata("Functions.kt")
    public void testFunctions() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Functions.kt", this::doTest);
    }

    @TestMetadata("InvokeCall.kt")
    public void testInvokeCall() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/InvokeCall.kt", this::doTest);
    }

    @TestMetadata("JavaTypes.kt")
    public void testJavaTypes() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/JavaTypes.kt", this::doTest);
    }

    @TestMetadata("KDoc.kt")
    public void testKDoc() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/KDoc.kt", this::doTest);
    }

    @TestMetadata("KotlinInjection.kt")
    public void testKotlinInjection() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/KotlinInjection.kt", this::doTest);
    }

    @TestMetadata("Labels.kt")
    public void testLabels() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Labels.kt", this::doTest);
    }

    @TestMetadata("NamedArguments.kt")
    public void testNamedArguments() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/NamedArguments.kt", this::doTest);
    }

    @TestMetadata("NonNullAssertion.kt")
    public void testNonNullAssertion() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/NonNullAssertion.kt", this::doTest);
    }

    @TestMetadata("Object.kt")
    public void testObject() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Object.kt", this::doTest);
    }

    @TestMetadata("SmartCast.kt")
    public void testSmartCast() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/SmartCast.kt", this::doTest);
    }

    @TestMetadata("SyntheticExtensionProperty.kt")
    public void testSyntheticExtensionProperty() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/SyntheticExtensionProperty.kt", this::doTest);
    }

    @TestMetadata("Todo.kt")
    public void testTodo() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Todo.kt", this::doTest);
    }

    @TestMetadata("TopLevelOpenSuspendFun.kt")
    public void testTopLevelOpenSuspendFun() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/TopLevelOpenSuspendFun.kt", this::doTest);
    }

    @TestMetadata("TypeAlias.kt")
    public void testTypeAlias() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/TypeAlias.kt", this::doTest);
    }

    @TestMetadata("TypesAndAnnotations.kt")
    public void testTypesAndAnnotations() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/TypesAndAnnotations.kt", this::doTest);
    }

    @TestMetadata("Variables.kt")
    public void testVariables() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/Variables.kt", this::doTest);
    }

    @TestMetadata("VariablesAsFunctions.kt")
    public void testVariablesAsFunctions() throws Exception {
        KotlinTestUtils.runTest("idea/testData/highlighter/VariablesAsFunctions.kt", this::doTest);
    }

    @TestMetadata("idea/testData/highlighter/deprecated")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Deprecated extends AbstractHighlightingTest {
        public void testAllFilesPresentInDeprecated() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/highlighter/deprecated"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Class.kt", this::doTest);
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/ClassObject.kt", this::doTest);
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Constructor.kt", this::doTest);
        }

        @TestMetadata("ExtensionFunction.kt")
        public void testExtensionFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/ExtensionFunction.kt", this::doTest);
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Function.kt", this::doTest);
        }

        @TestMetadata("Get.kt")
        public void testGet() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Get.kt", this::doTest);
        }

        @TestMetadata("Getter.kt")
        public void testGetter() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Getter.kt", this::doTest);
        }

        @TestMetadata("Inc.kt")
        public void testInc() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Inc.kt", this::doTest);
        }

        @TestMetadata("Invalid.kt")
        public void testInvalid() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Invalid.kt", this::doTest);
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Invoke.kt", this::doTest);
        }

        @TestMetadata("Operation.kt")
        public void testOperation() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Operation.kt", this::doTest);
        }

        @TestMetadata("Property.kt")
        public void testProperty() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Property.kt", this::doTest);
        }

        @TestMetadata("RangeTo.kt")
        public void testRangeTo() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/RangeTo.kt", this::doTest);
        }

        @TestMetadata("Setter.kt")
        public void testSetter() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Setter.kt", this::doTest);
        }

        @TestMetadata("SuperCall.kt")
        public void testSuperCall() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/SuperCall.kt", this::doTest);
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            KotlinTestUtils.runTest("idea/testData/highlighter/deprecated/Trait.kt", this::doTest);
        }
    }
}
