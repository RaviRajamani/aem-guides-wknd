package com.adobe.aem.guides.wknd.components.mycomponent;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyComponentModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    public String getTitle() { return title; }
    public String getDescription() { return description; }
}