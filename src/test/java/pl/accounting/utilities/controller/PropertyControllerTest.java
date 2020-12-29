package pl.accounting.utilities.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PropertyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void methodGetAddPropertyShouldReturnEmptyFormWithSpecificFields() throws Exception {
        this.mockMvc.perform(get("/addProperty"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("addProperty"))
                .andExpect(content().string(containsString("name")))
                .andExpect(content().string(containsString("street")))
                .andExpect(content().string(containsString("city")))
                .andExpect(content().string(containsString("zipCode")))
                .andExpect(content().string(containsString("ownerFirstName")))
                .andExpect(content().string(containsString("ownerLastName")))
                .andExpect(content().string(containsString("ownerPhoneNumber")))
                .andExpect(model().attribute("newProperty", hasProperty("name", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("street", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("city", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("zipCode", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("ownerFirstName", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("ownerLastName", nullValue())))
                .andExpect(model().attribute("newProperty", hasProperty("ownerPhoneNumber", nullValue())));
    }

    @Test
    public void addProperty() throws Exception {
        this.mockMvc.perform(post("/addProperty"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }


}