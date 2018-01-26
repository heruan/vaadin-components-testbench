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
package com.vaadin.flow.component.progressbar.testbench.test;

import com.vaadin.flow.component.common.testbench.test.AbstractView;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route("ProgressBar")
@Theme(Lumo.class)
public class ProgressBarView extends AbstractView {

    public static final String DEFAULT = "default";
    public static final String HUNDRED = "hundred";

    public ProgressBarView() {
        ProgressBar progressBar = new ProgressBar();
        progressBar.setId(DEFAULT);
        progressBar.setWidth("200px");
        progressBar.setValue(0.75d);
        add(progressBar);

        progressBar = new ProgressBar(0.0, 100.0);
        progressBar.setId(HUNDRED);
        progressBar.setWidth("200px");
        progressBar.setValue(22d);
        add(progressBar);
    }

}
