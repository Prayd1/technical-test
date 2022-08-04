<template>
  <ClientList :all-clients="allClients" />
</template>

<script lang="ts">
import { defineComponent } from "vue";
import Client from "./types/Client";
import ResponseData from "./types/ResponseData";
import ClientService from "./services/ClientService";
import ClientList from "@/components/ClientList.vue";

export default defineComponent({
  name: "App",
  data() {
    return {
      allClients: [] as Client[]
    };
  },
  components: {
    ClientList,
  },
  methods: {
    getClients() {
      ClientService.getClients()
          .then((response: ResponseData) => {
            this.allClients = response.data;
          })
          .catch((e: Error) => {
            console.log(e);
          });
    }
  },
  mounted() {
    this.getClients();
  }
});
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
