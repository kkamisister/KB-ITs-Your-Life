<template>
  <li>
    <input type="checkbox" :id="id" v-model="localChecked" />
    <label :for="id">{{ name }}</label>
  </li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: {
    id: [Number, String],
    name: {
      type: String,
      required: true,
    },
    checked: {
      type: Boolean,
      default: false,
    },
  },
  data() {
    return {
      localChecked: this.checked,
    };
  },
};
</script>