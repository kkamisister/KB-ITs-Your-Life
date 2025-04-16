<template>
  <div>
    <input type="text" :value="name" @input="onInput" />
  </div>
</template>

<script>
export default {
  name: 'InputName',
  props: {
    name: {
      type: String,
      required: true,
      validator: (value) => typeof value === 'string' && value.length >= 3,
    },
  },
  methods: {
    onInput(event) {
      this.$emit('nameChanged', event.target.value);
    },
  },
};
</script>