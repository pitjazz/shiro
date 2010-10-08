/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.shiro.spring;

import org.apache.shiro.web.servlet.ShiroFilter;


/**
 * Extension of ShiroFilter that uses {@link SpringIniWebConfiguration} to configure Shiro in a Spring web
 * environment.
 * <p/>
 * Using this class in web.xml essentially enables the following:
 * <pre>&lt;filter&gt;
 * &lt;filter-name&gt;ShiroFilter&lt;/filter-name&gt;
 * &lt;filter-class&gt;org.apache.shiro.web.servlet.ShiroFilter&lt;/filter-class&gt;
 * &lt;init-param&gt;
 *     &lt;param-name&gt;configClassName&lt;/param-name&gt;
 *     &lt;param-value&gt;org.apache.shiro.spring.SpringIniWebConfiguration&lt;param-value&gt;
 * &lt;/init-param&gt;
 * &lt;init-param&gt;
 *     &lt;param-name&gt;config&lt;/param-name&gt;
 *     &lt;param-value&gt;
 *     ... normal .ini config ...
 *     &lt;param-value&gt;
 * &lt;/init-param&gt;
 * &lt;filter&gt;</pre>
 * <p/>
 * That is, you don't have to specify the additional <code>configClassName</code> <code>init-param</code>.
 *
 * @author Les Hazlewood
 * @author Jeremy Haile
 * @since 0.2
 * @deprecated Will be removed before 1.0 final!
 */
@Deprecated
public class SpringShiroFilter extends ShiroFilter {

    //TODO - complete JavaDoc

    /**
     * Default constructor, merely calls
     * <code>{@link #configClassName this.configClassName} = {@link SpringIniWebConfiguration SpringIniWebConfiguration}.class.getName()}</code>.
     */
    public SpringShiroFilter() {
        this.configClassName = SpringIniWebConfiguration.class.getName();
    }
}