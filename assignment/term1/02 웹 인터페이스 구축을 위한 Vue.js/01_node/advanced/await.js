async function init() {
  const usersFetch = await fetch('https://jsonplaceholder.typicode.com/users')
  const users = await usersFetch.json()
  console.log(users)
}

init()
