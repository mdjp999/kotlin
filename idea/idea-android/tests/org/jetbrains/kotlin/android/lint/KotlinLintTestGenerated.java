/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.lint;

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
@TestMetadata("idea/testData/android/lint")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinLintTestGenerated extends AbstractKotlinLintTest {
    @TestMetadata("alarm.kt")
    public void testAlarm() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/alarm.kt", this::doTest);
    }

    public void testAllFilesPresentInLint() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/lint"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("apiCheck.kt")
    public void testApiCheck() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/apiCheck.kt", this::doTest);
    }

    @TestMetadata("callSuper.kt")
    public void testCallSuper() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/callSuper.kt", this::doTest);
    }

    @TestMetadata("closeCursor.kt")
    public void testCloseCursor() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/closeCursor.kt", this::doTest);
    }

    @TestMetadata("commitFragment.kt")
    public void testCommitFragment() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/commitFragment.kt", this::doTest);
    }

    @TestMetadata("findViewById.kt")
    public void testFindViewById() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/findViewById.kt", this::doTest);
    }

    @TestMetadata("javaPerformance.kt")
    public void testJavaPerformance() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/javaPerformance.kt", this::doTest);
    }

    @TestMetadata("javaScriptInterface.kt")
    public void testJavaScriptInterface() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/javaScriptInterface.kt", this::doTest);
    }

    @TestMetadata("layoutInflation.kt")
    public void testLayoutInflation() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/layoutInflation.kt", this::doTest);
    }

    @TestMetadata("log.kt")
    public void testLog() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/log.kt", this::doTest);
    }

    @TestMetadata("noInternationalSms.kt")
    public void testNoInternationalSms() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/noInternationalSms.kt", this::doTest);
    }

    @TestMetadata("overrideConcrete.kt")
    public void testOverrideConcrete() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/overrideConcrete.kt", this::doTest);
    }

    @TestMetadata("parcel.kt")
    public void testParcel() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/parcel.kt", this::doTest);
    }

    @TestMetadata("sdCardTest.kt")
    public void testSdCardTest() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/sdCardTest.kt", this::doTest);
    }

    @TestMetadata("setJavaScriptEnabled.kt")
    public void testSetJavaScriptEnabled() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/setJavaScriptEnabled.kt", this::doTest);
    }

    @TestMetadata("sharedPrefs.kt")
    public void testSharedPrefs() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/sharedPrefs.kt", this::doTest);
    }

    @TestMetadata("showDiagnosticsWhenFileIsRed.kt")
    public void testShowDiagnosticsWhenFileIsRed() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/showDiagnosticsWhenFileIsRed.kt", this::doTest);
    }

    @TestMetadata("sqlite.kt")
    public void testSqlite() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/sqlite.kt", this::doTest);
    }

    @TestMetadata("supportAnnotation.kt")
    public void testSupportAnnotation() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/supportAnnotation.kt", this::doTest);
    }

    @TestMetadata("systemServices.kt")
    public void testSystemServices() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/systemServices.kt", this::doTest);
    }

    @TestMetadata("toast.kt")
    public void testToast() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/toast.kt", this::doTest);
    }

    @TestMetadata("valueOf.kt")
    public void testValueOf() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/valueOf.kt", this::doTest);
    }

    @TestMetadata("velocityTrackerRecycle.kt")
    public void testVelocityTrackerRecycle() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/velocityTrackerRecycle.kt", this::doTest);
    }

    @TestMetadata("viewConstructor.kt")
    public void testViewConstructor() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/viewConstructor.kt", this::doTest);
    }

    @TestMetadata("viewHolder.kt")
    public void testViewHolder() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/viewHolder.kt", this::doTest);
    }

    @TestMetadata("wrongAnnotation.kt")
    public void testWrongAnnotation() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/wrongAnnotation.kt", this::doTest);
    }

    @TestMetadata("wrongImport.kt")
    public void testWrongImport() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/wrongImport.kt", this::doTest);
    }

    @TestMetadata("wrongViewCall.kt")
    public void testWrongViewCall() throws Exception {
        KotlinTestUtils.runTest("idea/testData/android/lint/wrongViewCall.kt", this::doTest);
    }
}
