<template>
  <table>
    <thead>
    <tr>
      <th>id</th>
      <th>clientFirstName</th>
      <th>clientLastName</th>
    </tr>
    </thead>
    <tbody>
    <Client v-for="client in allClients" v-bind:key="client.id" :client="client" />
    </tbody>
  </table>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import Client from "../components/Client.vue";
export default  defineComponent ({
  name: "ClientList",
  components: {
    Client
  },
  props: {
    allClients: { type: [], required: true}
  }
})
</script>

<style scoped>
</style>