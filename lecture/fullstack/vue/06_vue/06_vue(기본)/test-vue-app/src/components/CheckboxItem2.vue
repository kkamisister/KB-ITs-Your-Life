<template>
  <li>
    <input type="checkbox" :id="idol.id" v-model="idol.checked" />
    <label :for="idol.id">{{ idol.name }}</label>
  </li>
</template>

<script>
export default {
  name: 'CheckboxItem2',
  props: {
    idol: {
      type: Object,
      required: true,
    },
  },
};
</script>