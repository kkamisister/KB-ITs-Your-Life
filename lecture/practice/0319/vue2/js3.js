// fetch('https://jsonplaceholder.typicode.com/posts#')
//   .then((response) => response.json()) //
//   .then((json) => console.log(json))

// function getPosts() {
//   let response = fetch('https://jsonplaceholder.typicode.com/posts')
//   console.log(response)
// }
// getPosts()

let posts
async function getPosts() {
  try {
    let response = await fetch('https://jsonplaceholder.typicode.com/posts')
    console.log(response)
    posts = await response.json()
    console.log(posts.length)
  } catch (err) {
    console.error(err)
  } finally {
    console.log('끝')
  }
}
getPosts()
