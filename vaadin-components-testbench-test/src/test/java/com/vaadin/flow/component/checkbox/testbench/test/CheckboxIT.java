/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.checkbox.testbench.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vaadin.flow.component.checkbox.testbench.CheckboxElement;
import com.vaadin.flow.component.common.testbench.test.AbstractIT;

public class CheckboxIT extends AbstractIT {

    private CheckboxElement checkboxWithText;
    private CheckboxElement checkboxWithNoText;
    private CheckboxElement checkboxInitiallyChecked;

    @Before
    public void find() {
        checkboxWithText = $(CheckboxElement.class).id(CheckboxView.TEXT);
        checkboxWithNoText = $(CheckboxElement.class).id(CheckboxView.NOTEXT);
        checkboxInitiallyChecked = $(CheckboxElement.class)
                .id(CheckboxView.CHECKED);
    }

    @Test
    public void checkUncheck() throws Exception {
        Assert.assertFalse(checkboxWithNoText.isChecked());
        Assert.assertFalse(checkboxWithText.isChecked());
        Assert.assertTrue(checkboxInitiallyChecked.isChecked());

        checkboxWithNoText.setChecked(true);
        Assert.assertTrue(checkboxWithNoText.isChecked());
        checkboxWithText.setChecked(true);
        Assert.assertTrue(checkboxWithText.isChecked());
        checkboxInitiallyChecked.setChecked(false);
        Assert.assertFalse(checkboxInitiallyChecked.isChecked());

        checkboxWithNoText.setChecked(false);
        Assert.assertFalse(checkboxWithNoText.isChecked());
        checkboxWithText.setChecked(false);
        Assert.assertFalse(checkboxWithText.isChecked());
        checkboxInitiallyChecked.setChecked(true);
        Assert.assertTrue(checkboxInitiallyChecked.isChecked());
    }

    @Test
    public void getLabel() throws Exception {
        Assert.assertEquals("Text", checkboxWithText.getLabel());
        Assert.assertEquals("", checkboxWithNoText.getLabel());
        Assert.assertEquals("Checked initially",
                checkboxInitiallyChecked.getLabel());
    }

}
