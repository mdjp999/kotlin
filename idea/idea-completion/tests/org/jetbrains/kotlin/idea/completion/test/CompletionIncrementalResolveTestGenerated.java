/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestMetadata("idea/idea-completion/testData/incrementalResolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompletionIncrementalResolveTestGenerated extends AbstractCompletionIncrementalResolveTest {
    public void testAllFilesPresentInIncrementalResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/incrementalResolve"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("codeAboveChanged.kt")
    public void testCodeAboveChanged() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/codeAboveChanged.kt", this::doTest);
    }

    @TestMetadata("codeAboveChanged2.kt")
    public void testCodeAboveChanged2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/codeAboveChanged2.kt", this::doTest);
    }

    @TestMetadata("dataFlowInfoFromPrevStatement.kt")
    public void testDataFlowInfoFromPrevStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/dataFlowInfoFromPrevStatement.kt", this::doTest);
    }

    @TestMetadata("dataFlowInfoFromSameStatement.kt")
    public void testDataFlowInfoFromSameStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/dataFlowInfoFromSameStatement.kt", this::doTest);
    }

    @TestMetadata("doNotAnalyzeComplexStatement.kt")
    public void testDoNotAnalyzeComplexStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/doNotAnalyzeComplexStatement.kt", this::doTest);
    }

    @TestMetadata("noDataFlowFromOldStatement.kt")
    public void testNoDataFlowFromOldStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/noDataFlowFromOldStatement.kt", this::doTest);
    }

    @TestMetadata("noPrevStatement.kt")
    public void testNoPrevStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/noPrevStatement.kt", this::doTest);
    }

    @TestMetadata("outOfBlockModification.kt")
    public void testOutOfBlockModification() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/outOfBlockModification.kt", this::doTest);
    }

    @TestMetadata("prevStatementNotResolved.kt")
    public void testPrevStatementNotResolved() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/prevStatementNotResolved.kt", this::doTest);
    }

    @TestMetadata("sameStatement.kt")
    public void testSameStatement() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/incrementalResolve/sameStatement.kt", this::doTest);
    }
}
