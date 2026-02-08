
import React,{useEffect,useState} from 'react';
import axios from 'axios';

function App(){
  const [posts,setPosts]=useState([]);
  useEffect(()=>{
    axios.get('/api/posts').then(r=>setPosts(r.data));
  },[]);
  return (
    <div>
      <h1>Social Media Feed</h1>
      {posts.map((p,i)=>(<div key={i}><b>{p.author}</b>: {p.content}</div>))}
    </div>
  );
}
export default App;
