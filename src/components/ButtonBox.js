import "./ButtonBox.css";
import React, { Component }  from 'react';

const ButtonBox = ({ children }) => {
  return <div className="buttonBox">{children}</div>;
};

export default ButtonBox;