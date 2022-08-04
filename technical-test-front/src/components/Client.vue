<template>
  <tr>
    <td> {{ client.id }}</td>
    <td> {{ client.clientFirstName }}</td>
    <td> {{ client.clientLastName }}</td>
  </tr>
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
  name: "Client",
  props: {
    client: {type: Object, required: true}
  },
});
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>