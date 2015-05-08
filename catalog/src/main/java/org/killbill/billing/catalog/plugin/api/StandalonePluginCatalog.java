/*
 * Copyright 2010-2013 Ning, Inc.
 * Copyright 2015 Groupon, Inc
 * Copyright 2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.catalog.plugin.api;

import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.catalog.api.Plan;
import org.killbill.billing.catalog.api.PriceList;
import org.killbill.billing.catalog.api.Product;
import org.killbill.billing.catalog.api.Unit;

public interface StandalonePluginCatalog {

    /**
     *
     * @return the effective date for this catalog
     */
    DateTime getEffectiveDate();

    /**
     *
     * @return the {@code Currency}s available
     */
    Iterable<Currency> getCurrencies();

    /**
     *
     * @return the {@code Unit}s available
     */
    Iterable<Unit> getUnits();

    /**
     *
     * @return the {@code Product}s available
     */
    Iterable<Product> getProducts();

    /**
     *
     * @return the {@code Plan}s available
     */
    Iterable<Plan> getPlans();

    /**
     *
     * @return the {@code PriceList}s available (the first one will be the default {@code PriceList})
     */
    Iterable<PriceList> getPriceLists();

//    /**
//     *
//     * @return the {@code PlanRules} defining the behavior of the catalog
//     */
//    PlanRules getRules();

}
