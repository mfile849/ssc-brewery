package guru.sfg.brewery.web.controllers.api;

import guru.sfg.brewery.web.controllers.BaseIT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class BeerRestControllerIT extends BaseIT {

    @Test
    void deleteBeerBadCredsUrl() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4")
                        .param("Api-Key", "spring").param("Api-Secret", "mfileXXX"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void deleteBeerUrl() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4")
                        .param("Api-Key", "spring").param("Api-Secret", "mfile"))
                .andExpect(status().isOk());
    }

    @Test
    void deleteBeerBadCreds() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4")
                        .header("Api-Key", "spring").header("Api-Secret", "mfileXXX"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void deleteBeer() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4")
                .header("Api-Key", "spring").header("Api-Secret", "mfile"))
                .andExpect(status().isOk());
    }

    @Test
    void deleteBeerHttpBasic() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4")
                .with(httpBasic("spring", "mfile")))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void deleteBeerNoAuth() throws Exception{
        mockMvc.perform(delete("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void findBeers() throws Exception{
        mockMvc.perform(get("/api/v1/beer/"))
                .andExpect(status().isOk());
    }

    @Test
    void findBeerById() throws Exception{
        mockMvc.perform(get("/api/v1/beer/f98366cd-1a90-4b03-a52a-e507bf8e9ff4"))
                .andExpect(status().isOk());
    }

    @Test
    void findBeerByUpc() throws Exception{
        mockMvc.perform(get("/api/v1/beerUpc/0631234200036"))
                .andExpect(status().isOk());
    }
}
